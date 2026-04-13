package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ColorLineAccent16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ColorLineAccent16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.007f, 11.414f)
            curveToRelative(0.072f, 0.116f, 0.157f, 0.225f, 0.256f, 0.323f)
            curveToRelative(0.327f, 0.328f, 0.771f, 0.512f, 1.234f, 0.513f)
            curveToRelative(0.158f, 0f, 0.316f, -0.02f, 0.468f, -0.063f)
            lineToRelative(2.397f, -0.655f)
            horizontalLineToRelative(0.001f)
            curveTo(6.753f, 11.423f, 7.12f, 11.242f, 7.44f, 11f)
            horizontalLineToRelative(6.06f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            horizontalLineToRelative(-11f)
            curveTo(2.224f, 14f, 2f, 13.776f, 2f, 13.5f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -0.03f, 0.002f, -0.058f, 0.007f, -0.086f)
            close()
        }
    }.build()
}

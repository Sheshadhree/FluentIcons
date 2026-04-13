package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ColorLineAccent24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ColorLineAccent24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.004f, 15.631f)
            curveToRelative(0.01f, 0.15f, 0.037f, 0.299f, 0.08f, 0.444f)
            curveToRelative(0.318f, 1.058f, 1.433f, 1.658f, 2.491f, 1.34f)
            lineToRelative(4.293f, -1.288f)
            curveToRelative(0.426f, -0.128f, 0.82f, -0.342f, 1.159f, -0.627f)
            horizontalLineTo(19.5f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            horizontalLineToRelative(-15f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -0.372f, 0.203f, -0.696f, 0.504f, -0.869f)
            close()
        }
    }.build()
}

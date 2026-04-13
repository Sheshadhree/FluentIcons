package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ColorFillAccent24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ColorFillAccent24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13.052f, 15f)
            curveToRelative(0.273f, 1.61f, 1.58f, 3f, 3.448f, 3f)
            curveToRelative(1.842f, 0f, 3.14f, -1.354f, 3.436f, -2.936f)
            curveTo(20.552f, 15.251f, 21f, 15.824f, 21f, 16.5f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-15f)
            curveTo(3.672f, 21f, 3f, 20.328f, 3f, 19.5f)
            verticalLineToRelative(-3f)
            curveTo(3f, 15.672f, 3.672f, 15f, 4.5f, 15f)
            horizontalLineToRelative(3.09f)
            curveToRelative(1.144f, 1.047f, 2.903f, 1.047f, 4.048f, 0f)
            horizontalLineToRelative(1.414f)
            close()
        }
    }.build()
}

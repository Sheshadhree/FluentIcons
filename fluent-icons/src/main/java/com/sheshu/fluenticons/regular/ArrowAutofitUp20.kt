package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowAutofitUp20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowAutofitUp20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16.142f, 4.81f)
            lineToRelative(-1.14f, -1.18f)
            verticalLineTo(17.5f)
            curveToRelative(0f, 0.276f, -0.223f, 0.5f, -0.5f, 0.5f)
            curveToRelative(-0.275f, 0f, -0.5f, -0.224f, -0.5f, -0.5f)
            verticalLineTo(3.626f)
            lineTo(12.86f, 4.809f)
            curveToRelative(-0.192f, 0.199f, -0.509f, 0.204f, -0.707f, 0.013f)
            curveToRelative(-0.199f, -0.192f, -0.205f, -0.509f, -0.013f, -0.708f)
            lineToRelative(1.821f, -1.885f)
            curveToRelative(0.295f, -0.305f, 0.784f, -0.305f, 1.08f, 0f)
            lineToRelative(1.82f, 1.885f)
            curveToRelative(0.192f, 0.2f, 0.187f, 0.516f, -0.012f, 0.708f)
            curveToRelative(-0.199f, 0.191f, -0.515f, 0.186f, -0.707f, -0.013f)
            close()
            moveTo(5f, 3f)
            curveTo(3.895f, 3f, 3f, 3.895f, 3f, 5f)
            verticalLineToRelative(10f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(6.5f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(11.776f, 16f, 11.5f, 16f)
            horizontalLineTo(5f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            verticalLineTo(5f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(4.5f)
            curveTo(9.776f, 4f, 10f, 3.776f, 10f, 3.5f)
            reflectiveCurveTo(9.776f, 3f, 9.5f, 3f)
            horizontalLineTo(5f)
            close()
        }
    }.build()
}

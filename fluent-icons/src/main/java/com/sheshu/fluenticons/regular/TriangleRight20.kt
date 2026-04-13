package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TriangleRight20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TriangleRight20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17.215f, 11.318f)
            curveToRelative(1.047f, -0.567f, 1.047f, -2.07f, 0f, -2.638f)
            lineTo(5.216f, 2.18f)
            curveToRelative(-1f, -0.54f, -2.214f, 0.183f, -2.214f, 1.32f)
            verticalLineToRelative(12.999f)
            curveToRelative(0f, 1.136f, 1.215f, 1.86f, 2.214f, 1.319f)
            lineToRelative(11.999f, -6.5f)
            close()
            moveTo(16.739f, 9.56f)
            curveToRelative(0.349f, 0.189f, 0.349f, 0.69f, 0f, 0.879f)
            lineToRelative(-11.999f, 6.5f)
            curveToRelative(-0.333f, 0.18f, -0.738f, -0.061f, -0.738f, -0.44f)
            verticalLineToRelative(-13f)
            curveToRelative(0f, -0.378f, 0.405f, -0.62f, 0.738f, -0.439f)
            lineToRelative(11.999f, 6.5f)
            close()
        }
    }.build()
}

package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TriangleLeft20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TriangleLeft20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.786f, 11.318f)
            curveToRelative(-1.048f, -0.567f, -1.048f, -2.07f, 0f, -2.638f)
            lineToRelative(11.998f, -6.5f)
            curveTo(15.784f, 1.64f, 17f, 2.364f, 17f, 3.5f)
            verticalLineToRelative(12.999f)
            curveToRelative(0f, 1.136f, -1.215f, 1.86f, -2.215f, 1.319f)
            lineToRelative(-11.998f, -6.5f)
            close()
            moveTo(3.262f, 9.56f)
            curveToRelative(-0.35f, 0.189f, -0.35f, 0.69f, 0f, 0.879f)
            lineToRelative(11.998f, 6.5f)
            curveToRelative(0.334f, 0.18f, 0.739f, -0.061f, 0.739f, -0.44f)
            verticalLineToRelative(-13f)
            curveToRelative(0f, -0.378f, -0.405f, -0.62f, -0.739f, -0.439f)
            lineTo(3.262f, 9.56f)
            close()
        }
    }.build()
}

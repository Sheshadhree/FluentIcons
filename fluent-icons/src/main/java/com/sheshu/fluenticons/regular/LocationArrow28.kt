package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.LocationArrow28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.LocationArrow28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(25.897f, 4.042f)
            curveToRelative(0.467f, -1.213f, -0.725f, -2.405f, -1.938f, -1.938f)
            lineTo(2.962f, 10.178f)
            curveToRelative(-1.36f, 0.523f, -1.252f, 2.48f, 0.156f, 2.851f)
            lineToRelative(8.96f, 2.358f)
            curveToRelative(0.262f, 0.069f, 0.466f, 0.273f, 0.535f, 0.534f)
            lineToRelative(2.358f, 8.96f)
            curveToRelative(0.37f, 1.408f, 2.328f, 1.516f, 2.85f, 0.157f)
            lineToRelative(8.076f, -20.997f)
            close()
            moveToRelative(-1.4f, -0.538f)
            lineTo(16.421f, 24.5f)
            lineToRelative(-2.358f, -8.96f)
            curveToRelative(-0.206f, -0.785f, -0.819f, -1.397f, -1.603f, -1.604f)
            lineTo(3.5f, 11.58f)
            lineToRelative(20.997f, -8.075f)
            close()
        }
    }.build()
}

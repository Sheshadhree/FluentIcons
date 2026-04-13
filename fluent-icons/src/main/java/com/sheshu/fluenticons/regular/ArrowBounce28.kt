package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowBounce28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowBounce28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 7.75f)
            curveTo(2f, 7.336f, 2.336f, 7f, 2.75f, 7f)
            horizontalLineToRelative(8.5f)
            curveTo(11.664f, 7f, 12f, 7.336f, 12f, 7.75f)
            reflectiveCurveTo(11.664f, 8.5f, 11.25f, 8.5f)
            horizontalLineTo(4.615f)
            lineToRelative(10.387f, 9.963f)
            lineToRelative(9.731f, -9.256f)
            curveToRelative(0.3f, -0.286f, 0.775f, -0.274f, 1.06f, 0.026f)
            curveToRelative(0.286f, 0.3f, 0.274f, 0.775f, -0.026f, 1.06f)
            lineToRelative(-10.25f, 9.75f)
            curveToRelative(-0.29f, 0.277f, -0.747f, 0.276f, -1.036f, -0.002f)
            lineTo(3.5f, 9.51f)
            verticalLineToRelative(6.741f)
            curveTo(3.5f, 16.664f, 3.164f, 17f, 2.75f, 17f)
            reflectiveCurveTo(2f, 16.664f, 2f, 16.25f)
            verticalLineToRelative(-8.5f)
            close()
        }
    }.build()
}

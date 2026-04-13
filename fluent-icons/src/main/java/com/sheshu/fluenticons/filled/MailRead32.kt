package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.MailRead32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.MailRead32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13.745f, 2.623f)
            curveToRelative(1.395f, -0.807f, 3.115f, -0.807f, 4.51f, 0f)
            lineToRelative(9.5f, 5.5f)
            curveToRelative(0.662f, 0.384f, 1.202f, 0.921f, 1.587f, 1.552f)
            lineTo(16f, 16.865f)
            lineTo(2.653f, 9.682f)
            curveToRelative(0.385f, -0.635f, 0.928f, -1.175f, 1.592f, -1.56f)
            lineToRelative(9.5f, -5.5f)
            close()
            moveToRelative(-11.727f, 8.99f)
            curveTo(2.006f, 11.745f, 2f, 11.882f, 2f, 12.018f)
            verticalLineTo(22.5f)
            curveTo(2f, 24.985f, 4.015f, 27f, 6.5f, 27f)
            horizontalLineToRelative(19f)
            curveToRelative(2.485f, 0f, 4.5f, -2.015f, 4.5f, -4.5f)
            verticalLineTo(12.018f)
            curveToRelative(0f, -0.14f, -0.006f, -0.278f, -0.02f, -0.415f)
            lineTo(16.475f, 18.88f)
            curveToRelative(-0.296f, 0.16f, -0.652f, 0.16f, -0.948f, 0f)
            lineTo(2.018f, 11.614f)
            close()
        }
    }.build()
}

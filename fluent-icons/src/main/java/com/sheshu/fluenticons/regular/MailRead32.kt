package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.MailRead32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.MailRead32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18.255f, 2.623f)
            curveToRelative(-1.395f, -0.807f, -3.115f, -0.807f, -4.51f, 0f)
            lineToRelative(-9.5f, 5.5f)
            curveTo(2.855f, 8.928f, 2f, 10.413f, 2f, 12.018f)
            verticalLineTo(22.5f)
            curveTo(2f, 24.985f, 4.015f, 27f, 6.5f, 27f)
            horizontalLineToRelative(19f)
            curveToRelative(2.485f, 0f, 4.5f, -2.015f, 4.5f, -4.5f)
            verticalLineTo(12.018f)
            curveToRelative(0f, -1.606f, -0.856f, -3.09f, -2.245f, -3.895f)
            lineToRelative(-9.5f, -5.5f)
            close()
            moveToRelative(-3.508f, 1.731f)
            curveToRelative(0.775f, -0.449f, 1.73f, -0.449f, 2.506f, 0f)
            lineToRelative(9.5f, 5.5f)
            curveToRelative(0.337f, 0.195f, 0.617f, 0.462f, 0.826f, 0.775f)
            lineTo(16f, 16.864f)
            lineTo(4.421f, 10.63f)
            curveToRelative(0.21f, -0.313f, 0.49f, -0.58f, 0.826f, -0.775f)
            lineToRelative(9.5f, -5.5f)
            close()
            moveTo(4f, 12.674f)
            lineToRelative(11.526f, 6.207f)
            curveToRelative(0.296f, 0.159f, 0.652f, 0.159f, 0.948f, 0f)
            lineTo(28f, 12.674f)
            verticalLineTo(22.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-19f)
            curveTo(5.12f, 25f, 4f, 23.88f, 4f, 22.5f)
            verticalLineToRelative(-9.826f)
            close()
        }
    }.build()
}

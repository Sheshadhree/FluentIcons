package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.MailAllUnread20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.MailAllUnread20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14.5f, 7f)
            curveTo(15.88f, 7f, 17f, 5.88f, 17f, 4.5f)
            reflectiveCurveTo(15.88f, 2f, 14.5f, 2f)
            reflectiveCurveTo(12f, 3.12f, 12f, 4.5f)
            reflectiveCurveTo(13.12f, 7f, 14.5f, 7f)
            close()
            moveToRelative(-3.163f, -4f)
            horizontalLineTo(4.5f)
            curveTo(3.213f, 3f, 2.153f, 3.973f, 2.015f, 5.223f)
            lineTo(9f, 8.92f)
            lineToRelative(3.264f, -1.728f)
            curveTo(11.492f, 6.551f, 11f, 5.582f, 11f, 4.5f)
            curveToRelative(0f, -0.537f, 0.12f, -1.045f, 0.337f, -1.5f)
            close()
            moveToRelative(1.972f, 4.792f)
            lineTo(9.254f, 9.931f)
            curveToRelative(-0.157f, 0.092f, -0.351f, 0.092f, -0.507f, 0f)
            lineTo(2f, 6.373f)
            verticalLineTo(12.5f)
            curveTo(2f, 13.88f, 3.12f, 15f, 4.5f, 15f)
            horizontalLineToRelative(9f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineTo(7.663f)
            curveTo(15.545f, 7.88f, 15.037f, 8f, 14.5f, 8f)
            curveToRelative(-0.418f, 0f, -0.82f, -0.073f, -1.19f, -0.208f)
            close()
            moveTo(6.5f, 17f)
            curveToRelative(-0.818f, 0f, -1.544f, -0.393f, -2f, -1f)
            horizontalLineToRelative(9f)
            curveToRelative(1.933f, 0f, 3.5f, -1.567f, 3.5f, -3.5f)
            verticalLineToRelative(-5f)
            curveToRelative(0.607f, 0.456f, 1f, 1.182f, 1f, 2f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            horizontalLineToRelative(-7f)
            close()
        }
    }.build()
}

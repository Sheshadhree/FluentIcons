package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.MailInbox16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.MailInbox16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.5f, 2f)
            curveTo(3.12f, 2f, 2f, 3.12f, 2f, 4.5f)
            verticalLineToRelative(7f)
            curveTo(2f, 12.88f, 3.12f, 14f, 4.5f, 14f)
            horizontalLineToRelative(7f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-7f)
            curveTo(14f, 3.12f, 12.88f, 2f, 11.5f, 2f)
            horizontalLineToRelative(-7f)
            close()
            moveTo(13f, 8f)
            horizontalLineToRelative(-2.5f)
            lineToRelative(-0.09f, 0.008f)
            curveTo(10.177f, 8.05f, 10f, 8.255f, 10f, 8.5f)
            curveToRelative(0f, 0.052f, -0.008f, 0.162f, -0.032f, 0.308f)
            curveTo(9.927f, 9.055f, 9.853f, 9.301f, 9.74f, 9.526f)
            curveTo(9.432f, 10.144f, 8.897f, 10.5f, 8f, 10.5f)
            reflectiveCurveToRelative(-1.432f, -0.356f, -1.74f, -0.974f)
            curveToRelative(-0.113f, -0.225f, -0.187f, -0.47f, -0.228f, -0.718f)
            curveTo(6.008f, 8.662f, 6f, 8.552f, 6f, 8.5f)
            curveTo(6f, 8.224f, 5.776f, 8f, 5.5f, 8f)
            horizontalLineTo(3f)
            verticalLineTo(4.5f)
            curveTo(3f, 3.672f, 3.672f, 3f, 4.5f, 3f)
            horizontalLineToRelative(7f)
            curveTo(12.328f, 3f, 13f, 3.672f, 13f, 4.5f)
            verticalLineTo(8f)
            close()
            moveTo(3f, 9f)
            horizontalLineToRelative(2.044f)
            lineToRelative(0.035f, 0.174f)
            curveToRelative(0.057f, 0.252f, 0.149f, 0.524f, 0.286f, 0.8f)
            curveTo(5.838f, 10.919f, 6.71f, 11.5f, 8f, 11.5f)
            curveToRelative(1.29f, 0f, 2.162f, -0.581f, 2.635f, -1.526f)
            lineToRelative(0.095f, -0.206f)
            curveToRelative(0.086f, -0.205f, 0.148f, -0.405f, 0.19f, -0.594f)
            lineTo(10.956f, 9f)
            horizontalLineTo(13f)
            verticalLineToRelative(2.5f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-7f)
            curveTo(3.672f, 13f, 3f, 12.328f, 3f, 11.5f)
            verticalLineTo(9f)
            close()
        }
    }.build()
}

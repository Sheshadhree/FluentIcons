package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.MailInbox16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.MailInbox16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 4.5f)
            curveTo(2f, 3.12f, 3.12f, 2f, 4.5f, 2f)
            horizontalLineToRelative(7f)
            curveTo(12.88f, 2f, 14f, 3.12f, 14f, 4.5f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-7f)
            curveTo(3.12f, 14f, 2f, 12.88f, 2f, 11.5f)
            verticalLineToRelative(-7f)
            close()
            moveTo(13f, 8f)
            verticalLineTo(4.5f)
            curveTo(13f, 3.672f, 12.328f, 3f, 11.5f, 3f)
            horizontalLineToRelative(-7f)
            curveTo(3.672f, 3f, 3f, 3.672f, 3f, 4.5f)
            verticalLineTo(8f)
            horizontalLineToRelative(2.5f)
            curveTo(5.776f, 8f, 6f, 8.224f, 6f, 8.5f)
            curveToRelative(0f, 0.052f, 0.008f, 0.162f, 0.032f, 0.308f)
            curveToRelative(0.041f, 0.247f, 0.115f, 0.493f, 0.228f, 0.718f)
            curveTo(6.568f, 10.144f, 7.103f, 10.5f, 8f, 10.5f)
            reflectiveCurveToRelative(1.432f, -0.356f, 1.74f, -0.974f)
            curveToRelative(0.113f, -0.225f, 0.187f, -0.47f, 0.228f, -0.718f)
            curveTo(9.992f, 8.662f, 10f, 8.552f, 10f, 8.5f)
            curveToRelative(0f, -0.245f, 0.177f, -0.45f, 0.41f, -0.492f)
            lineTo(10.5f, 8f)
            horizontalLineTo(13f)
            close()
        }
    }.build()
}

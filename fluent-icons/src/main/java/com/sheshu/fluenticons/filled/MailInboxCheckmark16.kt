package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.MailInboxCheckmark16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.MailInboxCheckmark16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15f, 5.5f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            reflectiveCurveTo(6f, 7.985f, 6f, 5.5f)
            reflectiveCurveTo(8.015f, 1f, 10.5f, 1f)
            reflectiveCurveTo(15f, 3.015f, 15f, 5.5f)
            close()
            moveToRelative(-2.854f, -1.853f)
            lineTo(9.5f, 6.293f)
            lineTo(8.854f, 5.646f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.707f, 0f)
            curveToRelative(-0.196f, 0.196f, -0.196f, 0.512f, 0f, 0.708f)
            lineToRelative(1f, 1f)
            curveToRelative(0.195f, 0.195f, 0.511f, 0.195f, 0.707f, 0f)
            lineToRelative(3f, -3f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.708f, 0f)
            close()
            moveTo(14f, 9.742f)
            curveTo(13.05f, 10.528f, 11.83f, 11f, 10.5f, 11f)
            curveToRelative(-0.345f, 0f, -0.681f, -0.032f, -1.008f, -0.092f)
            curveTo(9.168f, 11.288f, 8.692f, 11.5f, 8f, 11.5f)
            curveToRelative(-0.897f, 0f, -1.432f, -0.356f, -1.74f, -0.974f)
            curveToRelative(-0.113f, -0.224f, -0.187f, -0.47f, -0.228f, -0.718f)
            curveTo(6.008f, 9.662f, 6f, 9.552f, 6f, 9.5f)
            curveTo(6f, 9.224f, 5.776f, 9f, 5.5f, 9f)
            horizontalLineTo(3f)
            verticalLineTo(5.5f)
            curveTo(3f, 4.672f, 3.672f, 4f, 4.5f, 4f)
            horizontalLineToRelative(0.707f)
            curveTo(5.306f, 3.651f, 5.437f, 3.317f, 5.6f, 3f)
            horizontalLineTo(4.5f)
            curveTo(3.12f, 3f, 2f, 4.12f, 2f, 5.5f)
            verticalLineToRelative(7f)
            curveTo(2f, 13.88f, 3.12f, 15f, 4.5f, 15f)
            horizontalLineToRelative(7f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineTo(9.743f)
            close()
        }
    }.build()
}

package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.MailMultiple20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.MailMultiple20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16f, 12.5f)
            verticalLineTo(6.373f)
            lineTo(9.254f, 9.931f)
            curveToRelative(-0.157f, 0.092f, -0.351f, 0.092f, -0.507f, 0f)
            lineTo(2f, 6.373f)
            verticalLineTo(12.5f)
            curveTo(2f, 13.88f, 3.12f, 15f, 4.5f, 15f)
            horizontalLineToRelative(9f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            close()
            moveToRelative(-0.015f, -7.277f)
            curveTo(15.847f, 3.973f, 14.787f, 3f, 13.5f, 3f)
            horizontalLineToRelative(-9f)
            curveTo(3.213f, 3f, 2.153f, 3.973f, 2.015f, 5.223f)
            lineTo(9f, 8.92f)
            lineToRelative(6.985f, -3.697f)
            close()
            moveTo(6.5f, 17f)
            curveToRelative(-0.818f, 0f, -1.544f, -0.393f, -2f, -1f)
            horizontalLineToRelative(9f)
            curveToRelative(1.933f, 0f, 3.5f, -1.567f, 3.5f, -3.5f)
            verticalLineToRelative(-7f)
            curveToRelative(0.607f, 0.456f, 1f, 1.182f, 1f, 2f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            horizontalLineToRelative(-7f)
            close()
        }
    }.build()
}

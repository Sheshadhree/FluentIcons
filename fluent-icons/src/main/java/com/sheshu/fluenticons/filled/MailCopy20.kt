package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.MailCopy20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.MailCopy20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4f, 12.5f)
            verticalLineTo(6.373f)
            lineToRelative(6.746f, 3.558f)
            curveToRelative(0.157f, 0.092f, 0.351f, 0.092f, 0.507f, 0f)
            lineTo(18f, 6.373f)
            verticalLineTo(12.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-9f)
            curveTo(5.12f, 15f, 4f, 13.88f, 4f, 12.5f)
            close()
            moveToRelative(0.015f, -7.277f)
            curveTo(4.153f, 3.973f, 5.213f, 3f, 6.5f, 3f)
            horizontalLineToRelative(9f)
            curveToRelative(1.287f, 0f, 2.347f, 0.973f, 2.485f, 2.223f)
            lineTo(11f, 8.92f)
            lineTo(4.015f, 5.223f)
            close()
            moveTo(13.5f, 17f)
            curveToRelative(0.818f, 0f, 1.544f, -0.393f, 2f, -1f)
            horizontalLineToRelative(-9f)
            curveTo(4.567f, 16f, 3f, 14.433f, 3f, 12.5f)
            verticalLineToRelative(-7f)
            curveToRelative(-0.607f, 0.456f, -1f, 1.182f, -1f, 2f)
            verticalLineToRelative(5f)
            curveTo(2f, 14.985f, 4.015f, 17f, 6.5f, 17f)
            horizontalLineToRelative(7f)
            close()
        }
    }.build()
}

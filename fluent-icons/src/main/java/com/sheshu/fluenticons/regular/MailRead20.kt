package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.MailRead20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.MailRead20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9.743f, 2.071f)
            curveToRelative(0.158f, -0.095f, 0.356f, -0.095f, 0.514f, 0f)
            lineToRelative(6.772f, 4.063f)
            curveTo(17.631f, 6.496f, 18f, 7.147f, 18f, 7.85f)
            verticalLineToRelative(6.65f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-11f)
            curveTo(3.12f, 17f, 2f, 15.88f, 2f, 14.5f)
            verticalLineTo(7.85f)
            curveToRelative(0f, -0.703f, 0.369f, -1.354f, 0.971f, -1.716f)
            lineToRelative(6.772f, -4.063f)
            close()
            moveTo(10f, 3.083f)
            lineTo(3.486f, 6.992f)
            lineTo(3.472f, 7f)
            lineTo(10f, 10.917f)
            lineTo(16.528f, 7f)
            lineToRelative(-0.013f, -0.008f)
            lineTo(10f, 3.083f)
            close()
            moveToRelative(7f, 4.8f)
            lineToRelative(-6.743f, 4.046f)
            curveToRelative(-0.158f, 0.095f, -0.356f, 0.095f, -0.514f, 0f)
            lineTo(3f, 7.883f)
            verticalLineTo(14.5f)
            curveTo(3f, 15.328f, 3.672f, 16f, 4.5f, 16f)
            horizontalLineToRelative(11f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineTo(7.883f)
            close()
        }
    }.build()
}

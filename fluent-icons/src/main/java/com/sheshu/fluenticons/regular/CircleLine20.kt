package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.CircleLine20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CircleLine20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.018f, 9.5f)
            horizontalLineToRelative(13.964f)
            curveTo(16.726f, 5.867f, 13.698f, 3f, 10f, 3f)
            curveTo(6.302f, 3f, 3.274f, 5.867f, 3.018f, 9.5f)
            close()
            moveTo(2f, 10f)
            curveToRelative(0f, -4.418f, 3.582f, -8f, 8f, -8f)
            reflectiveCurveToRelative(8f, 3.582f, 8f, 8f)
            reflectiveCurveToRelative(-3.582f, 8f, -8f, 8f)
            reflectiveCurveToRelative(-8f, -3.582f, -8f, -8f)
            close()
            moveToRelative(14.982f, 0.5f)
            horizontalLineTo(3.018f)
            curveTo(3.274f, 14.133f, 6.302f, 17f, 10f, 17f)
            curveToRelative(3.698f, 0f, 6.726f, -2.867f, 6.982f, -6.5f)
            close()
        }
    }.build()
}

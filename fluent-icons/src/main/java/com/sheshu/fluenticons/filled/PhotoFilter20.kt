package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PhotoFilter20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PhotoFilter20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.257f, 13.743f)
            curveTo(3.793f, 12.996f, 2f, 10.707f, 2f, 8f)
            curveToRelative(0f, -3.314f, 2.686f, -6f, 6f, -6f)
            curveToRelative(2.707f, 0f, 4.996f, 1.793f, 5.743f, 4.257f)
            curveTo(16.207f, 7.004f, 18f, 9.293f, 18f, 12f)
            curveToRelative(0f, 3.314f, -2.686f, 6f, -6f, 6f)
            curveToRelative(-2.707f, 0f, -4.996f, -1.793f, -5.743f, -4.257f)
            close()
            moveTo(3.5f, 8f)
            curveToRelative(0f, 1.767f, 1.018f, 3.296f, 2.5f, 4.032f)
            verticalLineTo(12f)
            curveToRelative(0f, -3.314f, 2.686f, -6f, 6f, -6f)
            horizontalLineToRelative(0.032f)
            curveTo(11.296f, 4.518f, 9.767f, 3.5f, 8f, 3.5f)
            curveTo(5.515f, 3.5f, 3.5f, 5.515f, 3.5f, 8f)
            close()
            moveToRelative(4.468f, 6f)
            curveToRelative(0.736f, 1.482f, 2.265f, 2.5f, 4.032f, 2.5f)
            curveToRelative(2.485f, 0f, 4.5f, -2.015f, 4.5f, -4.5f)
            curveToRelative(0f, -1.767f, -1.018f, -3.296f, -2.5f, -4.032f)
            verticalLineTo(8f)
            curveToRelative(0f, 3.314f, -2.686f, 6f, -6f, 6f)
            horizontalLineTo(7.968f)
            close()
        }
    }.build()
}

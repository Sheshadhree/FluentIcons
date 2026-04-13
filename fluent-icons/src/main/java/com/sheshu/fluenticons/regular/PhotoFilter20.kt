package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.PhotoFilter20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PhotoFilter20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 8f)
            curveToRelative(0f, 2.707f, 1.793f, 4.996f, 4.257f, 5.743f)
            curveTo(7.004f, 16.207f, 9.293f, 18f, 12f, 18f)
            curveToRelative(3.314f, 0f, 6f, -2.686f, 6f, -6f)
            curveToRelative(0f, -2.707f, -1.793f, -4.996f, -4.257f, -5.743f)
            curveTo(12.996f, 3.793f, 10.707f, 2f, 8f, 2f)
            curveTo(4.686f, 2f, 2f, 4.686f, 2f, 8f)
            close()
            moveToRelative(6f, -5f)
            curveToRelative(2.062f, 0f, 3.832f, 1.248f, 4.597f, 3.03f)
            curveTo(12.4f, 6.01f, 12.2f, 6f, 12f, 6f)
            curveToRelative(-3.314f, 0f, -6f, 2.686f, -6f, 6f)
            curveToRelative(0f, 0.201f, 0.01f, 0.4f, 0.03f, 0.597f)
            curveTo(4.247f, 11.832f, 3f, 10.062f, 3f, 8f)
            curveToRelative(0f, -2.761f, 2.239f, -5f, 5f, -5f)
            close()
            moveToRelative(9f, 9f)
            curveToRelative(0f, 2.761f, -2.239f, 5f, -5f, 5f)
            curveToRelative(-2.062f, 0f, -3.832f, -1.248f, -4.597f, -3.03f)
            curveTo(7.6f, 13.99f, 7.8f, 14f, 8f, 14f)
            curveToRelative(3.314f, 0f, 6f, -2.686f, 6f, -6f)
            curveToRelative(0f, -0.201f, -0.01f, -0.4f, -0.03f, -0.597f)
            curveTo(15.753f, 8.168f, 17f, 9.938f, 17f, 12f)
            close()
        }
    }.build()
}

package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.FlowDot16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.FlowDot16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.5f, 2f)
            curveToRelative(0.653f, 0f, 1.207f, 0.418f, 1.413f, 1f)
            horizontalLineTo(11.5f)
            curveTo(12.88f, 3f, 14f, 4.12f, 14f, 5.5f)
            reflectiveCurveTo(12.88f, 8f, 11.5f, 8f)
            horizontalLineToRelative(-7f)
            curveTo(3.672f, 8f, 3f, 8.672f, 3f, 9.5f)
            reflectiveCurveTo(3.672f, 11f, 4.5f, 11f)
            horizontalLineToRelative(6.587f)
            curveToRelative(0.206f, -0.582f, 0.76f, -1f, 1.413f, -1f)
            curveToRelative(0.828f, 0f, 1.5f, 0.672f, 1.5f, 1.5f)
            reflectiveCurveTo(13.328f, 13f, 12.5f, 13f)
            curveToRelative(-0.653f, 0f, -1.207f, -0.418f, -1.413f, -1f)
            horizontalLineTo(4.5f)
            curveTo(3.12f, 12f, 2f, 10.88f, 2f, 9.5f)
            reflectiveCurveTo(3.12f, 7f, 4.5f, 7f)
            horizontalLineToRelative(7f)
            curveTo(12.328f, 7f, 13f, 6.328f, 13f, 5.5f)
            reflectiveCurveTo(12.328f, 4f, 11.5f, 4f)
            horizontalLineTo(4.913f)
            curveTo(4.707f, 4.582f, 4.153f, 5f, 3.5f, 5f)
            curveTo(2.672f, 5f, 2f, 4.328f, 2f, 3.5f)
            reflectiveCurveTo(2.672f, 2f, 3.5f, 2f)
            close()
        }
    }.build()
}

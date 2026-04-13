package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Cart16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Cart16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.5f, 2f)
            curveTo(2.224f, 2f, 2f, 2.224f, 2f, 2.5f)
            reflectiveCurveTo(2.224f, 3f, 2.5f, 3f)
            horizontalLineToRelative(0.246f)
            curveToRelative(0.223f, 0f, 0.42f, 0.148f, 0.48f, 0.363f)
            lineToRelative(1.586f, 5.55f)
            curveTo(4.996f, 9.555f, 5.585f, 10f, 6.254f, 10f)
            horizontalLineToRelative(4.569f)
            curveToRelative(0.613f, 0f, 1.165f, -0.373f, 1.393f, -0.943f)
            lineToRelative(1.474f, -3.686f)
            curveTo(13.953f, 4.714f, 13.469f, 4f, 12.762f, 4f)
            horizontalLineTo(4.448f)
            lineToRelative(-0.26f, -0.912f)
            curveTo(4.004f, 2.444f, 3.415f, 2f, 2.746f, 2f)
            horizontalLineTo(2.5f)
            close()
            moveToRelative(4f, 12f)
            curveTo(7.328f, 14f, 8f, 13.328f, 8f, 12.5f)
            reflectiveCurveTo(7.328f, 11f, 6.5f, 11f)
            reflectiveCurveTo(5f, 11.672f, 5f, 12.5f)
            reflectiveCurveTo(5.672f, 14f, 6.5f, 14f)
            close()
            moveToRelative(4f, 0f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            reflectiveCurveTo(11.328f, 11f, 10.5f, 11f)
            reflectiveCurveTo(9f, 11.672f, 9f, 12.5f)
            reflectiveCurveTo(9.672f, 14f, 10.5f, 14f)
            close()
        }
    }.build()
}

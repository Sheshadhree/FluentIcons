package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Desktop16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Desktop16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.501f, 2f)
            curveToRelative(-0.829f, 0f, -1.5f, 0.672f, -1.5f, 1.5f)
            verticalLineToRelative(6.997f)
            curveToRelative(0f, 0.829f, 0.671f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(2.5f)
            verticalLineTo(13f)
            horizontalLineTo(4.495f)
            curveToRelative(-0.276f, 0f, -0.5f, 0.224f, -0.5f, 0.5f)
            reflectiveCurveTo(4.22f, 14f, 4.496f, 14f)
            horizontalLineTo(11.5f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(11.776f, 13f, 11.5f, 13f)
            horizontalLineTo(10f)
            verticalLineToRelative(-1.003f)
            horizontalLineToRelative(2.501f)
            curveToRelative(0.828f, 0f, 1.5f, -0.671f, 1.5f, -1.5f)
            verticalLineTo(3.5f)
            curveToRelative(0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-9f)
            close()
            moveToRelative(5.5f, 9.997f)
            verticalLineTo(13f)
            horizontalLineTo(7f)
            verticalLineToRelative(-1.003f)
            horizontalLineToRelative(2f)
            close()
        }
    }.build()
}

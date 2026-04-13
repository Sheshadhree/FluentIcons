package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Button20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Button20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 8f)
            curveToRelative(0f, -1.657f, 1.343f, -3f, 3f, -3f)
            horizontalLineToRelative(10f)
            curveToRelative(1.657f, 0f, 3f, 1.343f, 3f, 3f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 1.657f, -1.343f, 3f, -3f, 3f)
            horizontalLineTo(5f)
            curveToRelative(-1.657f, 0f, -3f, -1.343f, -3f, -3f)
            verticalLineTo(8f)
            close()
            moveToRelative(3f, -2f)
            curveTo(3.895f, 6f, 3f, 6.895f, 3f, 8f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(10f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineTo(8f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            horizontalLineTo(5f)
            close()
            moveToRelative(4f, 3.5f)
            curveTo(9f, 9.224f, 9.224f, 9f, 9.5f, 9f)
            horizontalLineTo(14f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(14.276f, 10f, 14f, 10f)
            horizontalLineTo(9.5f)
            curveTo(9.224f, 10f, 9f, 9.776f, 9f, 9.5f)
            close()
            moveToRelative(-1f, 0f)
            curveTo(8f, 10.328f, 7.328f, 11f, 6.5f, 11f)
            reflectiveCurveTo(5f, 10.328f, 5f, 9.5f)
            reflectiveCurveTo(5.672f, 8f, 6.5f, 8f)
            reflectiveCurveTo(8f, 8.672f, 8f, 9.5f)
            close()
        }
    }.build()
}

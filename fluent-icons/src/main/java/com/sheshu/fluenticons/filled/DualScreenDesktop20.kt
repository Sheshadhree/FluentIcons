package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.DualScreenDesktop20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DualScreenDesktop20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4f, 4f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(10f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            horizontalLineToRelative(-2f)
            verticalLineToRelative(2f)
            horizontalLineToRelative(1f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(15.276f, 16f, 15f, 16f)
            horizontalLineToRelative(-2f)
            verticalLineToRelative(-6f)
            curveToRelative(0f, -1.657f, -1.343f, -3f, -3f, -3f)
            horizontalLineTo(4f)
            verticalLineTo(4f)
            close()
            moveToRelative(6f, 14f)
            horizontalLineTo(7.5f)
            verticalLineTo(8f)
            horizontalLineTo(10f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            close()
            moveTo(4f, 8f)
            horizontalLineToRelative(2.5f)
            verticalLineToRelative(10f)
            horizontalLineTo(4f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            verticalLineToRelative(-6f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            close()
            moveToRelative(5.5f, 7f)
            curveTo(9.224f, 15f, 9f, 15.224f, 9f, 15.5f)
            reflectiveCurveTo(9.224f, 16f, 9.5f, 16f)
            horizontalLineTo(10f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(10.276f, 15f, 10f, 15f)
            horizontalLineTo(9.5f)
            close()
            moveToRelative(-6f, 0.5f)
            curveTo(3.5f, 15.776f, 3.724f, 16f, 4f, 16f)
            horizontalLineToRelative(0.5f)
            curveTo(4.776f, 16f, 5f, 15.776f, 5f, 15.5f)
            reflectiveCurveTo(4.776f, 15f, 4.5f, 15f)
            horizontalLineTo(4f)
            curveToRelative(-0.276f, 0f, -0.5f, 0.224f, -0.5f, 0.5f)
            close()
        }
    }.build()
}

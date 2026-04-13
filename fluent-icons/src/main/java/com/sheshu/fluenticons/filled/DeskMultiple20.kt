package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.DeskMultiple20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DeskMultiple20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.998f, 3f)
            curveToRelative(-0.74f, 0f, -1.387f, 0.402f, -1.732f, 1f)
            horizontalLineToRelative(9.732f)
            curveToRelative(1.657f, 0f, 3f, 1.343f, 3f, 3f)
            verticalLineToRelative(6.5f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            reflectiveCurveToRelative(0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineTo(7f)
            curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
            horizontalLineToRelative(-8f)
            close()
            moveTo(2f, 7f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(10f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(8.5f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            reflectiveCurveTo(15f, 15.776f, 15f, 15.5f)
            verticalLineTo(8f)
            horizontalLineTo(2f)
            verticalLineTo(7f)
            close()
            moveToRelative(0f, 2f)
            horizontalLineToRelative(7f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            horizontalLineTo(4f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            verticalLineTo(9f)
            close()
            moveToRelative(2.5f, 1.5f)
            curveTo(4.224f, 10.5f, 4f, 10.724f, 4f, 11f)
            reflectiveCurveToRelative(0.224f, 0.5f, 0.5f, 0.5f)
            horizontalLineToRelative(2f)
            curveTo(6.776f, 11.5f, 7f, 11.276f, 7f, 11f)
            reflectiveCurveToRelative(-0.224f, -0.5f, -0.5f, -0.5f)
            horizontalLineToRelative(-2f)
            close()
        }
    }.build()
}

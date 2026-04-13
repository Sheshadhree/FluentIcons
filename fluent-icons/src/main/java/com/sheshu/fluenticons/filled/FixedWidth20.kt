package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.FixedWidth20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.FixedWidth20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.5f, 3f)
            curveTo(3.776f, 3f, 4f, 3.224f, 4f, 3.5f)
            verticalLineTo(5f)
            horizontalLineToRelative(5.5f)
            verticalLineTo(3.5f)
            curveTo(9.5f, 3.224f, 9.724f, 3f, 10f, 3f)
            reflectiveCurveToRelative(0.5f, 0.224f, 0.5f, 0.5f)
            verticalLineTo(5f)
            horizontalLineTo(16f)
            verticalLineTo(3.5f)
            curveTo(16f, 3.224f, 16.224f, 3f, 16.5f, 3f)
            reflectiveCurveTo(17f, 3.224f, 17f, 3.5f)
            verticalLineToRelative(4f)
            curveTo(17f, 7.776f, 16.776f, 8f, 16.5f, 8f)
            reflectiveCurveTo(16f, 7.776f, 16f, 7.5f)
            verticalLineTo(6f)
            horizontalLineToRelative(-5.5f)
            verticalLineToRelative(1.5f)
            curveTo(10.5f, 7.776f, 10.276f, 8f, 10f, 8f)
            reflectiveCurveTo(9.5f, 7.776f, 9.5f, 7.5f)
            verticalLineTo(6f)
            horizontalLineTo(4f)
            verticalLineToRelative(1.5f)
            curveTo(4f, 7.776f, 3.776f, 8f, 3.5f, 8f)
            reflectiveCurveTo(3f, 7.776f, 3f, 7.5f)
            verticalLineToRelative(-4f)
            curveTo(3f, 3.224f, 3.224f, 3f, 3.5f, 3f)
            close()
            moveToRelative(6f, 6f)
            horizontalLineTo(5f)
            curveToRelative(-1.105f, 0f, -2f, 0.895f, -2f, 2f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(4.5f)
            verticalLineTo(9f)
            close()
            moveToRelative(1f, 8f)
            horizontalLineTo(15f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineToRelative(-4f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            horizontalLineToRelative(-4.5f)
            verticalLineToRelative(8f)
            close()
        }
    }.build()
}

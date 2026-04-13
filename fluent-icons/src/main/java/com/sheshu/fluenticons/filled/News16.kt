package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.News16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.News16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4f, 9f)
            verticalLineTo(8f)
            horizontalLineToRelative(1f)
            verticalLineToRelative(1f)
            horizontalLineTo(4f)
            close()
            moveTo(1f, 4f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(7f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(6.5f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            reflectiveCurveToRelative(0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineTo(4f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(4.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-9f)
            curveTo(2.12f, 13f, 1f, 11.88f, 1f, 10.5f)
            verticalLineTo(4f)
            close()
            moveToRelative(2.5f, 1f)
            curveTo(3.224f, 5f, 3f, 5.224f, 3f, 5.5f)
            reflectiveCurveTo(3.224f, 6f, 3.5f, 6f)
            horizontalLineToRelative(6f)
            curveTo(9.776f, 6f, 10f, 5.776f, 10f, 5.5f)
            reflectiveCurveTo(9.776f, 5f, 9.5f, 5f)
            horizontalLineToRelative(-6f)
            close()
            moveToRelative(0f, 2f)
            curveTo(3.224f, 7f, 3f, 7.224f, 3f, 7.5f)
            verticalLineToRelative(2f)
            curveTo(3f, 9.776f, 3.224f, 10f, 3.5f, 10f)
            horizontalLineToRelative(2f)
            curveTo(5.776f, 10f, 6f, 9.776f, 6f, 9.5f)
            verticalLineToRelative(-2f)
            curveTo(6f, 7.224f, 5.776f, 7f, 5.5f, 7f)
            horizontalLineToRelative(-2f)
            close()
            moveToRelative(4f, 0f)
            curveTo(7.224f, 7f, 7f, 7.224f, 7f, 7.5f)
            reflectiveCurveTo(7.224f, 8f, 7.5f, 8f)
            horizontalLineToRelative(2f)
            curveTo(9.776f, 8f, 10f, 7.776f, 10f, 7.5f)
            reflectiveCurveTo(9.776f, 7f, 9.5f, 7f)
            horizontalLineToRelative(-2f)
            close()
            moveToRelative(0f, 2f)
            curveTo(7.224f, 9f, 7f, 9.224f, 7f, 9.5f)
            reflectiveCurveTo(7.224f, 10f, 7.5f, 10f)
            horizontalLineToRelative(2f)
            curveTo(9.776f, 10f, 10f, 9.776f, 10f, 9.5f)
            reflectiveCurveTo(9.776f, 9f, 9.5f, 9f)
            horizontalLineToRelative(-2f)
            close()
        }
    }.build()
}

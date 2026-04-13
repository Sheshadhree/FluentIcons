package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TextDensity20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextDensity20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.5f, 2f)
            curveTo(10.776f, 2f, 11f, 2.224f, 11f, 2.5f)
            verticalLineToRelative(15f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            reflectiveCurveTo(10f, 17.776f, 10f, 17.5f)
            verticalLineToRelative(-15f)
            curveTo(10f, 2.224f, 10.224f, 2f, 10.5f, 2f)
            close()
            moveTo(9f, 5f)
            horizontalLineTo(2.5f)
            curveTo(2.224f, 5f, 2f, 5.224f, 2f, 5.5f)
            reflectiveCurveTo(2.224f, 6f, 2.5f, 6f)
            horizontalLineTo(9f)
            verticalLineTo(5f)
            close()
            moveToRelative(0f, 3f)
            horizontalLineTo(2.5f)
            curveTo(2.224f, 8f, 2f, 8.224f, 2f, 8.5f)
            reflectiveCurveTo(2.224f, 9f, 2.5f, 9f)
            horizontalLineTo(9f)
            verticalLineTo(8f)
            close()
            moveToRelative(0f, 3f)
            horizontalLineTo(2.5f)
            curveTo(2.224f, 11f, 2f, 11.224f, 2f, 11.5f)
            reflectiveCurveTo(2.224f, 12f, 2.5f, 12f)
            horizontalLineTo(9f)
            verticalLineToRelative(-1f)
            close()
            moveToRelative(0f, 3f)
            horizontalLineTo(2.5f)
            curveTo(2.224f, 14f, 2f, 14.224f, 2f, 14.5f)
            reflectiveCurveTo(2.224f, 15f, 2.5f, 15f)
            horizontalLineTo(9f)
            verticalLineToRelative(-1f)
            close()
            moveToRelative(7.5f, 0f)
            horizontalLineTo(12f)
            verticalLineToRelative(-3f)
            horizontalLineToRelative(4.5f)
            curveToRelative(0.828f, 0f, 1.5f, 0.672f, 1.5f, 1.5f)
            reflectiveCurveTo(17.328f, 14f, 16.5f, 14f)
            close()
            moveToRelative(0f, -5f)
            horizontalLineTo(12f)
            verticalLineTo(6f)
            horizontalLineToRelative(4.5f)
            curveTo(17.328f, 6f, 18f, 6.672f, 18f, 7.5f)
            reflectiveCurveTo(17.328f, 9f, 16.5f, 9f)
            close()
        }
    }.build()
}

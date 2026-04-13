package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Bench20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Bench20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5f, 4f)
            curveTo(3.895f, 4f, 3f, 4.895f, 3f, 6f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(14f)
            verticalLineTo(6f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            horizontalLineTo(5f)
            close()
            moveToRelative(-2.5f, 7f)
            curveTo(1.672f, 11f, 1f, 11.672f, 1f, 12.5f)
            reflectiveCurveTo(1.672f, 14f, 2.5f, 14f)
            horizontalLineTo(3f)
            verticalLineToRelative(1.5f)
            curveTo(3f, 15.776f, 3.224f, 16f, 3.5f, 16f)
            reflectiveCurveTo(4f, 15.776f, 4f, 15.5f)
            verticalLineTo(14f)
            horizontalLineToRelative(12f)
            verticalLineToRelative(1.5f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            reflectiveCurveToRelative(0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineTo(14f)
            horizontalLineToRelative(0.5f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            reflectiveCurveTo(18.328f, 11f, 17.5f, 11f)
            horizontalLineToRelative(-15f)
            close()
        }
    }.build()
}

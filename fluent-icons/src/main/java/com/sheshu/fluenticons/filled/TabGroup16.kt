package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TabGroup16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TabGroup16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 3f)
            curveTo(1.895f, 3f, 1f, 3.895f, 1f, 5f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(8f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineTo(5f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            horizontalLineTo(3f)
            close()
            moveToRelative(1f, 4f)
            curveToRelative(0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
            horizontalLineToRelative(5f)
            curveTo(9.776f, 6.5f, 10f, 6.724f, 10f, 7f)
            reflectiveCurveTo(9.776f, 7.5f, 9.5f, 7.5f)
            horizontalLineToRelative(-5f)
            curveTo(4.224f, 7.5f, 4f, 7.276f, 4f, 7f)
            close()
            moveToRelative(0.998f, 6f)
            curveToRelative(-0.74f, 0f, -1.387f, -0.402f, -1.732f, -1f)
            horizontalLineToRelative(7.732f)
            curveToRelative(1.657f, 0f, 3f, -1.343f, 3f, -3f)
            verticalLineTo(5.268f)
            curveToRelative(0.598f, 0.345f, 1f, 0.992f, 1f, 1.732f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
            horizontalLineToRelative(-6f)
            close()
        }
    }.build()
}

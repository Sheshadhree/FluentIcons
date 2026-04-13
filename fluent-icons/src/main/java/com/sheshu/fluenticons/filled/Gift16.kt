package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Gift16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Gift16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 5f)
            horizontalLineTo(7f)
            verticalLineToRelative(3f)
            horizontalLineTo(3f)
            curveTo(2.448f, 8f, 2f, 7.552f, 2f, 7f)
            verticalLineTo(6f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(1.268f)
            curveTo(4.098f, 4.706f, 4f, 4.364f, 4f, 4f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            curveToRelative(0.597f, 0f, 1.133f, 0.262f, 1.5f, 0.677f)
            curveTo(7.867f, 2.262f, 8.403f, 2f, 9f, 2f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            curveToRelative(0f, 0.364f, -0.097f, 0.706f, -0.268f, 1f)
            horizontalLineTo(12f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            verticalLineToRelative(1f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            horizontalLineTo(8f)
            verticalLineTo(5f)
            close()
            moveTo(5f, 4f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(1f)
            verticalLineTo(4f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            reflectiveCurveTo(5f, 3.448f, 5f, 4f)
            close()
            moveToRelative(3f, 1f)
            horizontalLineToRelative(1f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveTo(9.552f, 3f, 9f, 3f)
            reflectiveCurveTo(8f, 3.448f, 8f, 4f)
            verticalLineToRelative(1f)
            close()
            moveToRelative(4f, 4f)
            horizontalLineTo(8f)
            verticalLineToRelative(5f)
            horizontalLineToRelative(2f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineTo(9f)
            close()
            moveToRelative(-5f, 5f)
            verticalLineTo(9f)
            horizontalLineTo(3f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(2f)
            close()
        }
    }.build()
}

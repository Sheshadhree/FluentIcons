package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.InkingToolAccent24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.InkingToolAccent24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4f, 7f)
            horizontalLineToRelative(16.25f)
            curveToRelative(0.118f, 0f, 0.218f, -0.082f, 0.243f, -0.193f)
            lineTo(20.5f, 6.75f)
            verticalLineTo(3f)
            horizontalLineTo(3.75f)
            verticalLineToRelative(3.75f)
            curveToRelative(0f, 0.118f, 0.082f, 0.218f, 0.193f, 0.243f)
            lineTo(4f, 7f)
            close()
            moveToRelative(7.976f, 6.946f)
            lineToRelative(2.641f, -5.947f)
            lineTo(15.5f, 7.5f)
            lineToRelative(0.758f, 0.499f)
            lineToRelative(-2.911f, 6.556f)
            curveTo(13.227f, 14.825f, 12.957f, 15f, 12.66f, 15f)
            curveToRelative(-0.542f, 0f, -0.905f, -0.558f, -0.685f, -1.054f)
            close()
            moveTo(13f, 19f)
            curveToRelative(0f, 1.105f, -0.448f, 2f, -1f, 2f)
            reflectiveCurveToRelative(-1f, -0.895f, -1f, -2f)
            reflectiveCurveToRelative(0.448f, -2f, 1f, -2f)
            reflectiveCurveToRelative(1f, 0.895f, 1f, 2f)
            close()
        }
    }.build()
}

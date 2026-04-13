package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PersonBoard12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PersonBoard12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(1f, 3f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(4f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            horizontalLineTo(3f)
            curveTo(1.895f, 9f, 1f, 8.105f, 1f, 7f)
            verticalLineTo(3f)
            close()
            moveToRelative(4f, 1.25f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            reflectiveCurveToRelative(-1f, 0.448f, -1f, 1f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            close()
            moveToRelative(0f, 3f)
            curveToRelative(1.5f, 0f, 2f, -0.75f, 2f, -1.5f)
            curveTo(7f, 5.336f, 6.664f, 5f, 6.25f, 5f)
            horizontalLineToRelative(-2.5f)
            curveTo(3.336f, 5f, 3f, 5.336f, 3f, 5.75f)
            curveToRelative(0f, 0.75f, 0.5f, 1.5f, 2f, 1.5f)
            close()
            moveTo(3.268f, 10f)
            curveTo(3.613f, 10.598f, 4.26f, 11f, 5f, 11f)
            horizontalLineToRelative(2f)
            curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
            verticalLineTo(5f)
            curveToRelative(0f, -0.74f, -0.402f, -1.387f, -1f, -1.732f)
            verticalLineTo(7f)
            curveToRelative(0f, 1.657f, -1.343f, 3f, -3f, 3f)
            horizontalLineTo(3.268f)
            close()
        }
    }.build()
}

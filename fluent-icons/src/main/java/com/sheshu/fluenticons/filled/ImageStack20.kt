package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ImageStack20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ImageStack20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 3f)
            curveTo(4.343f, 3f, 3f, 4.343f, 3f, 6f)
            verticalLineToRelative(3f)
            horizontalLineToRelative(3.293f)
            lineToRelative(2.47f, -2.47f)
            curveToRelative(0.683f, -0.683f, 1.791f, -0.683f, 2.474f, 0f)
            lineTo(13.707f, 9f)
            horizontalLineTo(17f)
            verticalLineTo(6f)
            curveToRelative(0f, -1.657f, -1.343f, -3f, -3f, -3f)
            horizontalLineTo(6f)
            close()
            moveToRelative(11f, 7f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 1.438f, -1.011f, 2.639f, -2.361f, 2.932f)
            lineToRelative(-3.402f, -3.402f)
            curveToRelative(-0.683f, -0.683f, -1.791f, -0.683f, -2.474f, 0f)
            lineTo(5.36f, 16.932f)
            curveTo(4.011f, 16.639f, 3f, 15.438f, 3f, 14f)
            verticalLineToRelative(-4f)
            horizontalLineToRelative(14f)
            close()
            moveTo(6.707f, 17f)
            horizontalLineToRelative(6.586f)
            lineToRelative(-2.763f, -2.763f)
            curveToRelative(-0.293f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            lineTo(6.707f, 17f)
            close()
            moveToRelative(1f, -8f)
            horizontalLineToRelative(4.586f)
            lineTo(10.53f, 7.237f)
            curveToRelative(-0.293f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            lineTo(7.707f, 9f)
            close()
            moveTo(15.5f, 5.5f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            reflectiveCurveToRelative(-1f, -0.448f, -1f, -1f)
            reflectiveCurveToRelative(0.448f, -1f, 1f, -1f)
            reflectiveCurveToRelative(1f, 0.448f, 1f, 1f)
            close()
            moveToRelative(-1f, 8f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            reflectiveCurveToRelative(-1f, 0.448f, -1f, 1f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            close()
        }
    }.build()
}

package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PersonHeart24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PersonHeart24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.398f, 19.074f)
            curveToRelative(-1.373f, -1.372f, -1.665f, -3.416f, -0.877f, -5.075f)
            horizontalLineTo(4.253f)
            curveToRelative(-1.242f, 0f, -2.25f, 1.007f, -2.25f, 2.25f)
            verticalLineToRelative(0.92f)
            curveToRelative(0f, 0.571f, 0.18f, 1.129f, 0.511f, 1.595f)
            curveTo(4.056f, 20.928f, 6.58f, 22f, 10f, 22f)
            curveToRelative(1.413f, 0f, 2.673f, -0.183f, 3.774f, -0.55f)
            lineToRelative(-2.376f, -2.376f)
            close()
            moveTo(10f, 2.004f)
            curveToRelative(2.762f, 0f, 5f, 2.238f, 5f, 5f)
            curveToRelative(0f, 2.761f, -2.238f, 5f, -5f, 5f)
            curveToRelative(-2.761f, 0f, -5f, -2.239f, -5f, -5f)
            reflectiveCurveToRelative(2.239f, -5f, 5f, -5f)
            close()
            moveToRelative(7.044f, 20.991f)
            curveToRelative(-0.192f, 0f, -0.384f, -0.073f, -0.53f, -0.22f)
            lineToRelative(-4.409f, -4.408f)
            curveToRelative(-1.354f, -1.354f, -1.354f, -3.549f, 0f, -4.902f)
            curveToRelative(1.354f, -1.354f, 3.55f, -1.354f, 4.903f, 0f)
            lineToRelative(0.036f, 0.036f)
            lineToRelative(0.036f, -0.036f)
            curveToRelative(1.354f, -1.354f, 3.549f, -1.354f, 4.903f, 0f)
            curveToRelative(1.353f, 1.353f, 1.353f, 3.548f, 0f, 4.902f)
            lineToRelative(-4.409f, 4.409f)
            curveToRelative(-0.146f, 0.146f, -0.338f, 0.22f, -0.53f, 0.22f)
            close()
        }
    }.build()
}

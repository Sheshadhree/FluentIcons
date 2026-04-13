package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.NumberCircle120: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.NumberCircle120",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 18f)
            curveToRelative(4.418f, 0f, 8f, -3.582f, 8f, -8f)
            reflectiveCurveToRelative(-3.582f, -8f, -8f, -8f)
            reflectiveCurveToRelative(-8f, 3.582f, -8f, 8f)
            reflectiveCurveToRelative(3.582f, 8f, 8f, 8f)
            close()
            moveToRelative(1f, -11.5f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            reflectiveCurveTo(10f, 13.776f, 10f, 13.5f)
            verticalLineTo(8.477f)
            curveTo(9.622f, 8.96f, 9.182f, 9.397f, 8.777f, 9.666f)
            curveToRelative(-0.23f, 0.153f, -0.54f, 0.091f, -0.693f, -0.139f)
            curveToRelative(-0.153f, -0.23f, -0.091f, -0.54f, 0.139f, -0.693f)
            curveToRelative(0.313f, -0.209f, 0.711f, -0.6f, 1.064f, -1.071f)
            curveToRelative(0.355f, -0.473f, 0.625f, -0.974f, 0.728f, -1.384f)
            curveToRelative(0.061f, -0.245f, 0.295f, -0.406f, 0.546f, -0.375f)
            curveToRelative(0.25f, 0.03f, 0.44f, 0.244f, 0.44f, 0.496f)
            close()
        }
    }.build()
}

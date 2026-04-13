package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowSprint16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowSprint16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 4f)
            curveToRelative(1.933f, 0f, 3.5f, 1.567f, 3.5f, 3.5f)
            curveToRelative(0f, 0.537f, -0.12f, 1.045f, -0.337f, 1.5f)
            horizontalLineTo(10f)
            curveToRelative(0.314f, -0.418f, 0.5f, -0.937f, 0.5f, -1.5f)
            curveTo(10.5f, 6.12f, 9.38f, 5f, 8f, 5f)
            reflectiveCurveTo(5.5f, 6.12f, 5.5f, 7.5f)
            reflectiveCurveTo(6.62f, 10f, 8f, 10f)
            horizontalLineToRelative(5.293f)
            lineToRelative(-0.647f, -0.646f)
            curveToRelative(-0.195f, -0.196f, -0.195f, -0.512f, 0f, -0.707f)
            curveToRelative(0.196f, -0.196f, 0.512f, -0.196f, 0.708f, 0f)
            lineToRelative(1.5f, 1.5f)
            curveToRelative(0.195f, 0.195f, 0.195f, 0.511f, 0f, 0.707f)
            lineToRelative(-1.5f, 1.5f)
            curveToRelative(-0.196f, 0.195f, -0.512f, 0.195f, -0.708f, 0f)
            curveToRelative(-0.195f, -0.196f, -0.195f, -0.512f, 0f, -0.708f)
            lineTo(13.293f, 11f)
            horizontalLineTo(8f)
            curveToRelative(-1.933f, 0f, -3.5f, -1.567f, -3.5f, -3.5f)
            reflectiveCurveTo(6.067f, 4f, 8f, 4f)
            close()
            moveToRelative(-3.742f, 6f)
            curveToRelative(0.253f, 0.378f, 0.561f, 0.715f, 0.913f, 1f)
            horizontalLineTo(2.5f)
            curveTo(2.224f, 11f, 2f, 10.776f, 2f, 10.5f)
            reflectiveCurveTo(2.224f, 10f, 2.5f, 10f)
            horizontalLineToRelative(1.758f)
            close()
        }
    }.build()
}

package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowSprint20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowSprint20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 6.5f)
            curveToRelative(-1.161f, 0f, -2.169f, 0.66f, -2.667f, 1.625f)
            curveTo(7.12f, 8.537f, 7f, 9.005f, 7f, 9.5f)
            curveToRelative(0f, 1.657f, 1.343f, 3f, 3f, 3f)
            horizontalLineToRelative(6.44f)
            lineToRelative(-0.72f, -0.72f)
            curveToRelative(-0.293f, -0.293f, -0.293f, -0.767f, 0f, -1.06f)
            curveToRelative(0.293f, -0.293f, 0.767f, -0.293f, 1.06f, 0f)
            lineToRelative(2f, 2f)
            curveToRelative(0.293f, 0.293f, 0.293f, 0.767f, 0f, 1.06f)
            lineToRelative(-2f, 2f)
            curveToRelative(-0.293f, 0.293f, -0.767f, 0.293f, -1.06f, 0f)
            curveToRelative(-0.293f, -0.293f, -0.293f, -0.767f, 0f, -1.06f)
            lineTo(16.44f, 14f)
            horizontalLineTo(10f)
            curveToRelative(-2.485f, 0f, -4.5f, -2.015f, -4.5f, -4.5f)
            curveToRelative(0f, -0.601f, 0.118f, -1.175f, 0.332f, -1.7f)
            curveTo(6.502f, 6.158f, 8.116f, 5f, 10f, 5f)
            curveToRelative(2.485f, 0f, 4.5f, 2.015f, 4.5f, 4.5f)
            curveToRelative(0f, 0.718f, -0.168f, 1.398f, -0.468f, 2f)
            horizontalLineToRelative(-1.796f)
            curveTo(12.711f, 10.97f, 13f, 10.268f, 13f, 9.5f)
            curveToRelative(0f, -1.657f, -1.343f, -3f, -3f, -3f)
            close()
            moveToRelative(-7.25f, 6f)
            horizontalLineToRelative(2.64f)
            curveToRelative(0.382f, 0.587f, 0.875f, 1.097f, 1.447f, 1.5f)
            horizontalLineTo(2.75f)
            curveTo(2.336f, 14f, 2f, 13.664f, 2f, 13.25f)
            reflectiveCurveToRelative(0.336f, -0.75f, 0.75f, -0.75f)
            close()
        }
    }.build()
}

package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Search20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Search20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.535f, 13.596f)
            curveTo(11.427f, 14.476f, 10.025f, 15f, 8.5f, 15f)
            curveTo(4.91f, 15f, 2f, 12.09f, 2f, 8.5f)
            reflectiveCurveTo(4.91f, 2f, 8.5f, 2f)
            reflectiveCurveTo(15f, 4.91f, 15f, 8.5f)
            curveToRelative(0f, 1.525f, -0.525f, 2.927f, -1.404f, 4.035f)
            lineToRelative(3.434f, 3.435f)
            curveToRelative(0.293f, 0.293f, 0.293f, 0.767f, 0f, 1.06f)
            curveToRelative(-0.266f, 0.267f, -0.683f, 0.29f, -0.976f, 0.073f)
            lineTo(15.97f, 17.03f)
            lineToRelative(-3.435f, -3.434f)
            close()
            moveTo(13.5f, 8.5f)
            curveToRelative(0f, -2.761f, -2.239f, -5f, -5f, -5f)
            reflectiveCurveToRelative(-5f, 2.239f, -5f, 5f)
            reflectiveCurveToRelative(2.239f, 5f, 5f, 5f)
            reflectiveCurveToRelative(5f, -2.239f, 5f, -5f)
            close()
        }
    }.build()
}

package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowWrap20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowWrap20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13.75f, 3.5f)
            curveTo(15.545f, 3.5f, 17f, 4.955f, 17f, 6.75f)
            reflectiveCurveTo(15.545f, 10f, 13.75f, 10f)
            horizontalLineToRelative(-7.5f)
            curveToRelative(-0.966f, 0f, -1.75f, 0.784f, -1.75f, 1.75f)
            reflectiveCurveToRelative(0.784f, 1.75f, 1.75f, 1.75f)
            horizontalLineToRelative(9.19f)
            lineToRelative(-0.22f, -0.22f)
            curveToRelative(-0.293f, -0.293f, -0.293f, -0.767f, 0f, -1.06f)
            curveToRelative(0.293f, -0.293f, 0.767f, -0.293f, 1.06f, 0f)
            lineToRelative(1.5f, 1.5f)
            curveToRelative(0.293f, 0.293f, 0.293f, 0.767f, 0f, 1.06f)
            lineToRelative(-1.5f, 1.5f)
            curveToRelative(-0.293f, 0.293f, -0.767f, 0.293f, -1.06f, 0f)
            curveToRelative(-0.293f, -0.293f, -0.293f, -0.767f, 0f, -1.06f)
            lineTo(15.44f, 15f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 15f, 3f, 13.545f, 3f, 11.75f)
            reflectiveCurveTo(4.455f, 8.5f, 6.25f, 8.5f)
            horizontalLineToRelative(7.5f)
            curveToRelative(0.966f, 0f, 1.75f, -0.784f, 1.75f, -1.75f)
            reflectiveCurveTo(14.716f, 5f, 13.75f, 5f)
            horizontalLineToRelative(-10f)
            curveTo(3.336f, 5f, 3f, 4.664f, 3f, 4.25f)
            reflectiveCurveTo(3.336f, 3.5f, 3.75f, 3.5f)
            horizontalLineToRelative(10f)
            close()
        }
    }.build()
}

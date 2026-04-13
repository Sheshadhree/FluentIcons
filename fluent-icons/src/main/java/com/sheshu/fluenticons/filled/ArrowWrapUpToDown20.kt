package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowWrapUpToDown20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowWrapUpToDown20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4f, 13.75f)
            curveTo(4f, 15.545f, 5.455f, 17f, 7.25f, 17f)
            reflectiveCurveToRelative(3.25f, -1.455f, 3.25f, -3.25f)
            verticalLineToRelative(-7.5f)
            curveToRelative(0f, -0.966f, 0.784f, -1.75f, 1.75f, -1.75f)
            reflectiveCurveTo(14f, 5.284f, 14f, 6.25f)
            verticalLineToRelative(9.19f)
            lineToRelative(-0.22f, -0.22f)
            curveToRelative(-0.293f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.767f, 0f, 1.06f)
            lineToRelative(1.5f, 1.5f)
            curveToRelative(0.293f, 0.293f, 0.767f, 0.293f, 1.06f, 0f)
            lineToRelative(1.5f, -1.5f)
            curveToRelative(0.293f, -0.293f, 0.293f, -0.767f, 0f, -1.06f)
            curveToRelative(-0.293f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            lineToRelative(-0.22f, 0.22f)
            verticalLineTo(6.25f)
            curveTo(15.5f, 4.455f, 14.045f, 3f, 12.25f, 3f)
            reflectiveCurveTo(9f, 4.455f, 9f, 6.25f)
            verticalLineToRelative(7.5f)
            curveToRelative(0f, 0.966f, -0.784f, 1.75f, -1.75f, 1.75f)
            reflectiveCurveTo(5.5f, 14.716f, 5.5f, 13.75f)
            verticalLineToRelative(-10f)
            curveTo(5.5f, 3.336f, 5.164f, 3f, 4.75f, 3f)
            reflectiveCurveTo(4f, 3.336f, 4f, 3.75f)
            verticalLineToRelative(10f)
            close()
        }
    }.build()
}

package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.OpenFolder20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.OpenFolder20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 6.25f)
            curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
            horizontalLineTo(14f)
            curveToRelative(1.795f, 0f, 3.25f, 1.455f, 3.25f, 3.25f)
            verticalLineToRelative(2f)
            curveTo(17.25f, 8.664f, 16.914f, 9f, 16.5f, 9f)
            reflectiveCurveToRelative(-0.75f, -0.336f, -0.75f, -0.75f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -0.966f, -0.784f, -1.75f, -1.75f, -1.75f)
            horizontalLineTo(6.25f)
            curveTo(5.284f, 4.5f, 4.5f, 5.284f, 4.5f, 6.25f)
            verticalLineToRelative(7.5f)
            curveToRelative(0f, 0.966f, 0.784f, 1.75f, 1.75f, 1.75f)
            horizontalLineToRelative(4f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveTo(10.664f, 17f, 10.25f, 17f)
            horizontalLineToRelative(-4f)
            curveTo(4.455f, 17f, 3f, 15.545f, 3f, 13.75f)
            verticalLineToRelative(-7.5f)
            close()
            moveToRelative(5f, 2.5f)
            curveTo(8f, 8.336f, 8.336f, 8f, 8.75f, 8f)
            horizontalLineToRelative(4.5f)
            curveTo(13.664f, 8f, 14f, 8.336f, 14f, 8.75f)
            reflectiveCurveTo(13.664f, 9.5f, 13.25f, 9.5f)
            horizontalLineToRelative(-2.69f)
            lineToRelative(5.22f, 5.22f)
            curveToRelative(0.293f, 0.293f, 0.293f, 0.767f, 0f, 1.06f)
            curveToRelative(-0.293f, 0.293f, -0.767f, 0.293f, -1.06f, 0f)
            lineTo(9.5f, 10.56f)
            verticalLineToRelative(2.69f)
            curveTo(9.5f, 13.664f, 9.164f, 14f, 8.75f, 14f)
            reflectiveCurveTo(8f, 13.664f, 8f, 13.25f)
            verticalLineToRelative(-4.5f)
            close()
        }
    }.build()
}

package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ExpandUpLeft24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ExpandUpLeft24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11f, 3.75f)
            curveTo(11f, 3.336f, 10.664f, 3f, 10.25f, 3f)
            horizontalLineToRelative(-6.5f)
            curveTo(3.334f, 3f, 3f, 3.336f, 3f, 3.75f)
            verticalLineToRelative(6.5f)
            curveTo(3f, 10.664f, 3.334f, 11f, 3.75f, 11f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineTo(5.56f)
            lineToRelative(5.22f, 5.22f)
            curveToRelative(0.293f, 0.293f, 0.767f, 0.293f, 1.06f, 0f)
            curveToRelative(0.293f, -0.293f, 0.293f, -0.768f, 0f, -1.06f)
            lineTo(5.56f, 4.5f)
            horizontalLineToRelative(4.69f)
            curveTo(10.664f, 4.5f, 11f, 4.164f, 11f, 3.75f)
            close()
            moveToRelative(8.5f, 2.5f)
            curveToRelative(0f, -0.966f, -0.784f, -1.75f, -1.75f, -1.75f)
            horizontalLineToRelative(-4f)
            curveTo(13.336f, 4.5f, 13f, 4.164f, 13f, 3.75f)
            reflectiveCurveTo(13.336f, 3f, 13.75f, 3f)
            horizontalLineToRelative(4f)
            curveTo(19.545f, 3f, 21f, 4.455f, 21f, 6.25f)
            verticalLineToRelative(11.5f)
            curveToRelative(0f, 1.795f, -1.455f, 3.25f, -3.25f, 3.25f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
            verticalLineToRelative(-4f)
            curveTo(3f, 13.336f, 3.336f, 13f, 3.75f, 13f)
            reflectiveCurveToRelative(0.75f, 0.336f, 0.75f, 0.75f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 0.966f, 0.784f, 1.75f, 1.75f, 1.75f)
            horizontalLineTo(12f)
            verticalLineToRelative(-4.75f)
            curveToRelative(0f, -1.519f, 1.231f, -2.75f, 2.75f, -2.75f)
            horizontalLineToRelative(4.75f)
            verticalLineTo(6.25f)
            close()
            moveToRelative(0f, 7.25f)
            horizontalLineToRelative(-4.75f)
            curveToRelative(-0.69f, 0f, -1.25f, 0.56f, -1.25f, 1.25f)
            verticalLineToRelative(4.75f)
            horizontalLineToRelative(4.25f)
            curveToRelative(0.966f, 0f, 1.75f, -0.784f, 1.75f, -1.75f)
            verticalLineTo(13.5f)
            close()
        }
    }.build()
}

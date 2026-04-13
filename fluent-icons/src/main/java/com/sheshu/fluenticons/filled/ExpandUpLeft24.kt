package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ExpandUpLeft24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ExpandUpLeft24",
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
            moveToRelative(6.75f, 0.75f)
            curveToRelative(0.966f, 0f, 1.75f, 0.784f, 1.75f, 1.75f)
            verticalLineTo(12f)
            horizontalLineToRelative(-4.75f)
            curveTo(13.231f, 12f, 12f, 13.231f, 12f, 14.75f)
            verticalLineToRelative(4.75f)
            horizontalLineTo(6.25f)
            curveToRelative(-0.966f, 0f, -1.75f, -0.784f, -1.75f, -1.75f)
            verticalLineToRelative(-4f)
            curveTo(4.5f, 13.336f, 4.164f, 13f, 3.75f, 13f)
            reflectiveCurveTo(3f, 13.336f, 3f, 13.75f)
            verticalLineToRelative(4f)
            curveTo(3f, 19.545f, 4.455f, 21f, 6.25f, 21f)
            horizontalLineToRelative(11.5f)
            curveToRelative(1.795f, 0f, 3.25f, -1.455f, 3.25f, -3.25f)
            verticalLineTo(6.25f)
            curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
            horizontalLineToRelative(-4f)
            curveTo(13.336f, 3f, 13f, 3.336f, 13f, 3.75f)
            reflectiveCurveToRelative(0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(4f)
            close()
        }
    }.build()
}

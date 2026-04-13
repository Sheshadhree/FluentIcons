package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Open24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Open24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.25f, 4.5f)
            curveTo(5.283f, 4.5f, 4.5f, 5.284f, 4.5f, 6.25f)
            verticalLineToRelative(11.5f)
            curveToRelative(0f, 0.966f, 0.783f, 1.75f, 1.75f, 1.75f)
            horizontalLineToRelative(11.5f)
            curveToRelative(0.966f, 0f, 1.75f, -0.784f, 1.75f, -1.75f)
            verticalLineToRelative(-4f)
            curveToRelative(0f, -0.414f, 0.335f, -0.75f, 0.75f, -0.75f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 1.795f, -1.456f, 3.25f, -3.25f, 3.25f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
            verticalLineTo(6.25f)
            curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
            horizontalLineToRelative(4f)
            curveTo(10.664f, 3f, 11f, 3.336f, 11f, 3.75f)
            reflectiveCurveTo(10.664f, 4.5f, 10.25f, 4.5f)
            horizontalLineToRelative(-4f)
            close()
            moveTo(13f, 3.75f)
            curveTo(13f, 3.336f, 13.335f, 3f, 13.75f, 3f)
            horizontalLineToRelative(6.5f)
            curveTo(20.664f, 3f, 21f, 3.336f, 21f, 3.75f)
            verticalLineToRelative(6.5f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            reflectiveCurveToRelative(-0.75f, -0.336f, -0.75f, -0.75f)
            verticalLineTo(5.56f)
            lineToRelative(-5.22f, 5.22f)
            curveToRelative(-0.293f, 0.293f, -0.768f, 0.293f, -1.06f, 0f)
            curveToRelative(-0.293f, -0.293f, -0.293f, -0.768f, 0f, -1.06f)
            lineToRelative(5.22f, -5.22f)
            horizontalLineToRelative(-4.69f)
            curveTo(13.335f, 4.5f, 13f, 4.164f, 13f, 3.75f)
            close()
        }
    }.build()
}

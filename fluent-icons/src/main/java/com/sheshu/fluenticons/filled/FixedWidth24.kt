package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.FixedWidth24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.FixedWidth24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.75f, 4f)
            curveTo(4.164f, 4f, 4.5f, 4.308f, 4.5f, 4.688f)
            verticalLineTo(6f)
            horizontalLineToRelative(6.75f)
            verticalLineTo(4.687f)
            curveTo(11.25f, 4.308f, 11.586f, 4f, 12f, 4f)
            reflectiveCurveToRelative(0.75f, 0.308f, 0.75f, 0.688f)
            verticalLineTo(6f)
            horizontalLineToRelative(6.75f)
            verticalLineTo(4.687f)
            curveTo(19.5f, 4.308f, 19.836f, 4f, 20.25f, 4f)
            reflectiveCurveTo(21f, 4.308f, 21f, 4.688f)
            verticalLineToRelative(4.125f)
            curveToRelative(0f, 0.38f, -0.336f, 0.687f, -0.75f, 0.687f)
            reflectiveCurveTo(19.5f, 9.192f, 19.5f, 8.812f)
            verticalLineTo(7.5f)
            horizontalLineToRelative(-6.75f)
            verticalLineToRelative(1.313f)
            curveToRelative(0f, 0.38f, -0.336f, 0.687f, -0.75f, 0.687f)
            reflectiveCurveToRelative(-0.75f, -0.308f, -0.75f, -0.688f)
            verticalLineTo(7.5f)
            horizontalLineTo(4.5f)
            verticalLineToRelative(1.313f)
            curveTo(4.5f, 9.193f, 4.164f, 9.5f, 3.75f, 9.5f)
            reflectiveCurveTo(3f, 9.192f, 3f, 8.812f)
            verticalLineTo(4.689f)
            curveTo(3f, 4.308f, 3.336f, 4f, 3.75f, 4f)
            close()
            moveToRelative(2f, 7f)
            curveTo(4.231f, 11f, 3f, 12.231f, 3f, 13.75f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 1.519f, 1.231f, 2.75f, 2.75f, 2.75f)
            horizontalLineToRelative(5.5f)
            verticalLineTo(11f)
            horizontalLineToRelative(-5.5f)
            close()
            moveToRelative(12.5f, 9.5f)
            horizontalLineToRelative(-5.5f)
            verticalLineTo(11f)
            horizontalLineToRelative(5.5f)
            curveToRelative(1.519f, 0f, 2.75f, 1.231f, 2.75f, 2.75f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 1.519f, -1.231f, 2.75f, -2.75f, 2.75f)
            close()
        }
    }.build()
}

package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.MyLocation20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.MyLocation20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 13f)
            curveToRelative(1.657f, 0f, 3f, -1.343f, 3f, -3f)
            reflectiveCurveToRelative(-1.343f, -3f, -3f, -3f)
            reflectiveCurveToRelative(-3f, 1.343f, -3f, 3f)
            reflectiveCurveToRelative(1.343f, 3f, 3f, 3f)
            close()
            moveToRelative(0.75f, -10.25f)
            curveTo(10.75f, 2.336f, 10.414f, 2f, 10f, 2f)
            reflectiveCurveTo(9.25f, 2.336f, 9.25f, 2.75f)
            verticalLineToRelative(1.296f)
            curveTo(6.536f, 4.385f, 4.385f, 6.536f, 4.046f, 9.25f)
            horizontalLineTo(2.75f)
            curveTo(2.336f, 9.25f, 2f, 9.586f, 2f, 10f)
            reflectiveCurveToRelative(0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(1.296f)
            curveToRelative(0.339f, 2.714f, 2.49f, 4.865f, 5.204f, 5.204f)
            verticalLineToRelative(1.296f)
            curveTo(9.25f, 17.664f, 9.586f, 18f, 10f, 18f)
            reflectiveCurveToRelative(0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineToRelative(-1.296f)
            curveToRelative(2.714f, -0.339f, 4.865f, -2.49f, 5.204f, -5.204f)
            horizontalLineToRelative(1.296f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveToRelative(-0.336f, -0.75f, -0.75f, -0.75f)
            horizontalLineToRelative(-1.296f)
            curveToRelative(-0.339f, -2.714f, -2.49f, -4.865f, -5.204f, -5.204f)
            verticalLineTo(2.75f)
            close()
            moveTo(10f, 14.5f)
            curveToRelative(-2.485f, 0f, -4.5f, -2.015f, -4.5f, -4.5f)
            reflectiveCurveTo(7.515f, 5.5f, 10f, 5.5f)
            reflectiveCurveToRelative(4.5f, 2.015f, 4.5f, 4.5f)
            reflectiveCurveToRelative(-2.015f, 4.5f, -4.5f, 4.5f)
            close()
        }
    }.build()
}

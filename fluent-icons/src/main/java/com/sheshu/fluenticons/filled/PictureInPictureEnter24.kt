package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PictureInPictureEnter24: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PictureInPictureEnter24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.25f, 3f)
            curveTo(3.455f, 3f, 2f, 4.455f, 2f, 6.25f)
            verticalLineToRelative(9.5f)
            curveTo(2f, 17.545f, 3.455f, 19f, 5.25f, 19f)
            horizontalLineTo(11f)
            verticalLineToRelative(-4f)
            curveToRelative(0f, -1.657f, 1.343f, -3f, 3f, -3f)
            horizontalLineToRelative(7f)
            curveToRelative(0.35f, 0f, 0.687f, 0.06f, 1f, 0.17f)
            verticalLineTo(6.25f)
            curveTo(22f, 4.455f, 20.545f, 3f, 18.75f, 3f)
            horizontalLineTo(5.25f)
            close()
            moveToRelative(1.03f, 3.22f)
            lineTo(9.5f, 9.44f)
            verticalLineTo(7.75f)
            curveTo(9.5f, 7.336f, 9.836f, 7f, 10.25f, 7f)
            reflectiveCurveTo(11f, 7.336f, 11f, 7.75f)
            verticalLineToRelative(3.5f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            horizontalLineToRelative(-3.5f)
            curveTo(6.336f, 12f, 6f, 11.664f, 6f, 11.25f)
            reflectiveCurveToRelative(0.336f, -0.75f, 0.75f, -0.75f)
            horizontalLineToRelative(1.69f)
            lineTo(5.22f, 7.28f)
            curveToRelative(-0.293f, -0.293f, -0.293f, -0.767f, 0f, -1.06f)
            curveToRelative(0.293f, -0.293f, 0.767f, -0.293f, 1.06f, 0f)
            close()
            moveTo(22f, 13.268f)
            curveTo(21.706f, 13.098f, 21.364f, 13f, 21f, 13f)
            horizontalLineToRelative(-7f)
            curveToRelative(-1.105f, 0f, -2f, 0.895f, -2f, 2f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(7f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineToRelative(-5f)
            curveToRelative(0f, -0.74f, -0.402f, -1.387f, -1f, -1.732f)
            close()
        }
    }.build()
}

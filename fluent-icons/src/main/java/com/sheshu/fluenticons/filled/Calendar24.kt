package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Calendar24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Calendar24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(21f, 8.5f)
            verticalLineToRelative(9.25f)
            curveToRelative(0f, 1.795f, -1.455f, 3.25f, -3.25f, 3.25f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
            verticalLineTo(8.5f)
            horizontalLineToRelative(18f)
            close()
            moveTo(7.25f, 15f)
            curveTo(6.56f, 15f, 6f, 15.56f, 6f, 16.25f)
            reflectiveCurveToRelative(0.56f, 1.25f, 1.25f, 1.25f)
            reflectiveCurveToRelative(1.25f, -0.56f, 1.25f, -1.25f)
            reflectiveCurveTo(7.94f, 15f, 7.25f, 15f)
            close()
            moveTo(12f, 15f)
            curveToRelative(-0.69f, 0f, -1.25f, 0.56f, -1.25f, 1.25f)
            reflectiveCurveTo(11.31f, 17.5f, 12f, 17.5f)
            reflectiveCurveToRelative(1.25f, -0.56f, 1.25f, -1.25f)
            reflectiveCurveTo(12.69f, 15f, 12f, 15f)
            close()
            moveToRelative(-4.75f, -4.5f)
            curveTo(6.56f, 10.5f, 6f, 11.06f, 6f, 11.75f)
            reflectiveCurveTo(6.56f, 13f, 7.25f, 13f)
            reflectiveCurveToRelative(1.25f, -0.56f, 1.25f, -1.25f)
            reflectiveCurveToRelative(-0.56f, -1.25f, -1.25f, -1.25f)
            close()
            moveToRelative(4.75f, 0f)
            curveToRelative(-0.69f, 0f, -1.25f, 0.56f, -1.25f, 1.25f)
            reflectiveCurveTo(11.31f, 13f, 12f, 13f)
            reflectiveCurveToRelative(1.25f, -0.56f, 1.25f, -1.25f)
            reflectiveCurveTo(12.69f, 10.5f, 12f, 10.5f)
            close()
            moveToRelative(4.75f, 0f)
            curveToRelative(-0.69f, 0f, -1.25f, 0.56f, -1.25f, 1.25f)
            reflectiveCurveTo(16.06f, 13f, 16.75f, 13f)
            reflectiveCurveTo(18f, 12.44f, 18f, 11.75f)
            reflectiveCurveToRelative(-0.56f, -1.25f, -1.25f, -1.25f)
            close()
            moveToRelative(1f, -7.5f)
            curveTo(19.545f, 3f, 21f, 4.455f, 21f, 6.25f)
            verticalLineTo(7f)
            horizontalLineTo(3f)
            verticalLineTo(6.25f)
            curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
            horizontalLineToRelative(11.5f)
            close()
        }
    }.build()
}

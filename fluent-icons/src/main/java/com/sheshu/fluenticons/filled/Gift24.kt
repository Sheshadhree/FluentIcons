package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Gift24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Gift24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.25f, 13f)
            verticalLineToRelative(9f)
            horizontalLineToRelative(-4f)
            curveTo(5.455f, 22f, 4f, 20.545f, 4f, 18.75f)
            verticalLineTo(13f)
            horizontalLineToRelative(7.25f)
            close()
            moveTo(20f, 13f)
            verticalLineToRelative(5.75f)
            curveToRelative(0f, 1.795f, -1.455f, 3.25f, -3.25f, 3.25f)
            horizontalLineToRelative(-4f)
            verticalLineToRelative(-9f)
            horizontalLineTo(20f)
            close()
            moveTo(14.5f, 2f)
            curveToRelative(1.795f, 0f, 3.25f, 1.455f, 3.25f, 3.25f)
            curveToRelative(0f, 0.645f, -0.188f, 1.246f, -0.512f, 1.752f)
            lineTo(19.75f, 7f)
            curveTo(20.44f, 7f, 21f, 7.466f, 21f, 8.042f)
            verticalLineToRelative(2.916f)
            curveTo(21f, 11.534f, 20.44f, 12f, 19.75f, 12f)
            lineToRelative(-7f, -0.001f)
            verticalLineTo(7f)
            horizontalLineToRelative(-1.5f)
            verticalLineToRelative(4.999f)
            lineTo(4.25f, 12f)
            curveTo(3.56f, 12f, 3f, 11.534f, 3f, 10.958f)
            verticalLineTo(8.042f)
            curveTo(3f, 7.466f, 3.56f, 7f, 4.25f, 7f)
            lineToRelative(2.512f, 0.002f)
            curveTo(6.438f, 6.495f, 6.25f, 5.894f, 6.25f, 5.25f)
            curveTo(6.25f, 3.455f, 7.705f, 2f, 9.5f, 2f)
            curveToRelative(1.005f, 0f, 1.904f, 0.457f, 2.5f, 1.174f)
            curveTo(12.597f, 2.457f, 13.496f, 2f, 14.5f, 2f)
            close()
            moveToRelative(-5f, 1.5f)
            curveToRelative(-0.966f, 0f, -1.75f, 0.784f, -1.75f, 1.75f)
            curveToRelative(0f, 0.918f, 0.707f, 1.671f, 1.607f, 1.744f)
            lineTo(9.5f, 7f)
            horizontalLineToRelative(1.75f)
            verticalLineTo(5.25f)
            lineToRelative(-0.006f, -0.144f)
            curveTo(11.171f, 4.207f, 10.418f, 3.5f, 9.5f, 3.5f)
            close()
            moveToRelative(5f, 0f)
            curveToRelative(-0.966f, 0f, -1.75f, 0.784f, -1.75f, 1.75f)
            verticalLineTo(7f)
            horizontalLineToRelative(1.75f)
            curveToRelative(0.966f, 0f, 1.75f, -0.784f, 1.75f, -1.75f)
            reflectiveCurveTo(15.466f, 3.5f, 14.5f, 3.5f)
            close()
        }
    }.build()
}

package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.CalendarToday24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CalendarToday24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(21f, 6.25f)
            curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
            verticalLineToRelative(11.5f)
            curveTo(3f, 19.545f, 4.455f, 21f, 6.25f, 21f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(-1.5f)
            horizontalLineToRelative(-4f)
            curveToRelative(-0.966f, 0f, -1.75f, -0.784f, -1.75f, -1.75f)
            verticalLineTo(8.5f)
            horizontalLineToRelative(15f)
            verticalLineToRelative(9.25f)
            curveToRelative(0f, 0.966f, -0.784f, 1.75f, -1.75f, 1.75f)
            horizontalLineToRelative(-4f)
            verticalLineTo(21f)
            horizontalLineToRelative(4f)
            curveToRelative(1.795f, 0f, 3.25f, -1.455f, 3.25f, -3.25f)
            verticalLineTo(6.25f)
            close()
            moveTo(6.25f, 4.5f)
            horizontalLineToRelative(11.5f)
            curveToRelative(0.966f, 0f, 1.75f, 0.784f, 1.75f, 1.75f)
            verticalLineTo(7f)
            horizontalLineToRelative(-15f)
            verticalLineTo(6.25f)
            curveToRelative(0f, -0.966f, 0.784f, -1.75f, 1.75f, -1.75f)
            close()
            moveToRelative(7f, 7.25f)
            curveToRelative(0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f)
            reflectiveCurveToRelative(-1.25f, -0.56f, -1.25f, -1.25f)
            reflectiveCurveToRelative(0.56f, -1.25f, 1.25f, -1.25f)
            reflectiveCurveToRelative(1.25f, 0.56f, 1.25f, 1.25f)
            close()
            moveToRelative(0.502f, 6.56f)
            curveToRelative(0.31f, 0.276f, 0.783f, 0.248f, 1.058f, -0.062f)
            curveToRelative(0.276f, -0.31f, 0.248f, -0.783f, -0.062f, -1.059f)
            lineToRelative(-2.25f, -2f)
            curveToRelative(-0.284f, -0.252f, -0.712f, -0.252f, -0.996f, 0f)
            lineToRelative(-2.25f, 2f)
            curveToRelative(-0.31f, 0.276f, -0.338f, 0.75f, -0.063f, 1.06f)
            curveToRelative(0.276f, 0.309f, 0.75f, 0.337f, 1.06f, 0.062f)
            lineToRelative(1.001f, -0.89f)
            verticalLineToRelative(3.829f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            reflectiveCurveToRelative(0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineToRelative(-3.83f)
            lineToRelative(1.002f, 0.89f)
            close()
        }
    }.build()
}

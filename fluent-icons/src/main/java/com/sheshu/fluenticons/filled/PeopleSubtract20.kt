package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PeopleSubtract20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PeopleSubtract20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 5.75f)
            curveTo(10f, 7.545f, 8.545f, 9f, 6.75f, 9f)
            reflectiveCurveTo(3.5f, 7.545f, 3.5f, 5.75f)
            reflectiveCurveTo(4.955f, 2.5f, 6.75f, 2.5f)
            reflectiveCurveTo(10f, 3.955f, 10f, 5.75f)
            close()
            moveTo(14.5f, 9f)
            curveTo(15.88f, 9f, 17f, 7.88f, 17f, 6.5f)
            reflectiveCurveTo(15.88f, 4f, 14.5f, 4f)
            reflectiveCurveTo(12f, 5.12f, 12f, 6.5f)
            reflectiveCurveTo(13.12f, 9f, 14.5f, 9f)
            close()
            moveToRelative(-3.507f, 1.263f)
            curveTo(9.775f, 11.273f, 9f, 12.796f, 9f, 14.5f)
            curveToRelative(0f, 0.395f, 0.042f, 0.78f, 0.121f, 1.153f)
            curveTo(8.483f, 15.868f, 7.703f, 16f, 6.75f, 16f)
            curveTo(1.5f, 16f, 1.5f, 12f, 1.5f, 12f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineTo(10f)
            curveToRelative(0.361f, 0f, 0.7f, 0.096f, 0.993f, 0.263f)
            close()
            moveTo(14.5f, 19f)
            curveToRelative(2.485f, 0f, 4.5f, -2.015f, 4.5f, -4.5f)
            reflectiveCurveTo(16.985f, 10f, 14.5f, 10f)
            reflectiveCurveTo(10f, 12.015f, 10f, 14.5f)
            reflectiveCurveToRelative(2.015f, 4.5f, 4.5f, 4.5f)
            close()
            moveTo(12f, 14.5f)
            curveToRelative(0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
            horizontalLineToRelative(4f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(16.776f, 15f, 16.5f, 15f)
            horizontalLineToRelative(-4f)
            curveToRelative(-0.276f, 0f, -0.5f, -0.224f, -0.5f, -0.5f)
            close()
        }
    }.build()
}

package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.MegaphoneCircle20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.MegaphoneCircle20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 3f)
            curveToRelative(-3.866f, 0f, -7f, 3.134f, -7f, 7f)
            reflectiveCurveToRelative(3.134f, 7f, 7f, 7f)
            reflectiveCurveToRelative(7f, -3.134f, 7f, -7f)
            reflectiveCurveToRelative(-3.134f, -7f, -7f, -7f)
            close()
            moveToRelative(-8f, 7f)
            curveToRelative(0f, -4.418f, 3.582f, -8f, 8f, -8f)
            reflectiveCurveToRelative(8f, 3.582f, 8f, 8f)
            reflectiveCurveToRelative(-3.582f, 8f, -8f, 8f)
            reflectiveCurveToRelative(-8f, -3.582f, -8f, -8f)
            close()
            moveToRelative(5f, 2.023f)
            lineToRelative(-1.171f, -0.418f)
            curveTo(5.332f, 11.426f, 5f, 10.954f, 5f, 10.427f)
            verticalLineToRelative(-0.85f)
            curveToRelative(0f, -0.529f, 0.332f, -1f, 0.829f, -1.178f)
            lineToRelative(6.501f, -2.325f)
            curveToRelative(0.814f, -0.291f, 1.671f, 0.312f, 1.671f, 1.177f)
            verticalLineToRelative(5.502f)
            curveToRelative(0f, 0.864f, -0.857f, 1.468f, -1.67f, 1.177f)
            lineToRelative(-1.379f, -0.493f)
            curveTo(10.752f, 14.33f, 9.954f, 15f, 9f, 15f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            verticalLineToRelative(-0.977f)
            close()
            moveToRelative(2.996f, 1.072f)
            lineTo(8f, 12.38f)
            verticalLineTo(13f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            curveToRelative(0.52f, 0f, 0.948f, -0.397f, 0.996f, -0.905f)
            close()
            moveToRelative(2.671f, -6.08f)
            lineTo(6.166f, 9.342f)
            curveTo(6.066f, 9.376f, 6f, 9.47f, 6f, 9.576f)
            verticalLineToRelative(0.851f)
            curveToRelative(0f, 0.106f, 0.066f, 0.2f, 0.166f, 0.236f)
            lineToRelative(6.501f, 2.325f)
            curveToRelative(0.163f, 0.058f, 0.334f, -0.062f, 0.334f, -0.235f)
            verticalLineTo(7.25f)
            curveToRelative(0f, -0.173f, -0.171f, -0.294f, -0.334f, -0.235f)
            close()
        }
    }.build()
}

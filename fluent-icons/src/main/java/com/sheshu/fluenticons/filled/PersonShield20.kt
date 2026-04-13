package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PersonShield20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PersonShield20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14.12f, 10.145f)
            curveToRelative(0.202f, -0.193f, 0.559f, -0.193f, 0.76f, 0f)
            curveToRelative(0.508f, 0.484f, 1.484f, 1.254f, 2.684f, 1.412f)
            curveTo(17.803f, 11.588f, 18f, 11.769f, 18f, 11.995f)
            verticalLineToRelative(2.111f)
            curveToRelative(0f, 2.838f, -2.784f, 3.868f, -3.386f, 4.058f)
            curveToRelative(-0.075f, 0.024f, -0.152f, 0.024f, -0.227f, 0f)
            curveToRelative(-0.602f, -0.19f, -3.387f, -1.22f, -3.387f, -4.058f)
            verticalLineToRelative(-2.11f)
            curveToRelative(0f, -0.227f, 0.197f, -0.408f, 0.437f, -0.44f)
            curveToRelative(1.199f, -0.157f, 2.174f, -0.927f, 2.682f, -1.411f)
            close()
            moveTo(10.49f, 11f)
            curveTo(10.198f, 11.238f, 10f, 11.582f, 10f, 11.995f)
            verticalLineToRelative(2.111f)
            curveToRelative(0f, 1.652f, 0.79f, 2.819f, 1.675f, 3.591f)
            curveTo(10.843f, 17.901f, 9.938f, 18f, 9f, 18f)
            curveToRelative(-1.855f, 0f, -3.583f, -0.386f, -4.865f, -1.203f)
            curveTo(2.833f, 15.967f, 2f, 14.69f, 2f, 13f)
            curveToRelative(0f, -1.113f, 0.903f, -2f, 2.009f, -2f)
            horizontalLineToRelative(6.481f)
            close()
            moveTo(9f, 2f)
            curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
            reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
            reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
            reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
            close()
        }
    }.build()
}
